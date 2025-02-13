import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PlantCareSystem {
    private JFrame frame;
    private JTable plantTable;
    private DefaultTableModel tableModel;
    private ArrayList<Plant> plantList;

    public PlantCareSystem() {
        plantList = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        // Set up main frame
        frame = new JFrame("Plant Care System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Table to display plant details
        String[] columnNames = {"Name", "Type", "Water Frequency (Days)", "Health", "Fertilizer"};
        tableModel = new DefaultTableModel(columnNames, 0);
        plantTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(plantTable);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Add Plant button
        JButton addPlantButton = new JButton("Add Plant");
        addPlantButton.addActionListener(e -> openAddPlantDialog());

        // Search Plant button
        JButton searchPlantButton = new JButton("Search Plant");
        searchPlantButton.addActionListener(e -> searchPlantDialog());

        // Plant Summary button
        JButton plantSummaryButton = new JButton("Show Plant Summary");
        plantSummaryButton.addActionListener(e -> showPlantSummary());

        // Delete Plant button
        JButton deletePlantButton = new JButton("Delete Plant");
        deletePlantButton.addActionListener(e -> deletePlantDialog());

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addPlantButton);
        buttonPanel.add(searchPlantButton);
        buttonPanel.add(plantSummaryButton);
        buttonPanel.add(deletePlantButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Set background color to a plant shade
        frame.getContentPane().setBackground(new Color(173, 216, 230));
        buttonPanel.setBackground(new Color(152, 251, 152));

        frame.setVisible(true);
    }

    private void openAddPlantDialog() {
        // Dialog to add a new plant
        JDialog dialog = new JDialog(frame, "Add Plant", true);
        dialog.setSize(400, 300);
        dialog.setLayout(new GridLayout(6, 2));

        JLabel nameLabel = new JLabel("Plant Name:");
        JTextField nameField = new JTextField();

        JLabel typeLabel = new JLabel("Plant Type:");
        JTextField typeField = new JTextField();

        JLabel frequencyLabel = new JLabel("Water Frequency (Days):");
        JTextField frequencyField = new JTextField();

        JLabel healthLabel = new JLabel("Health:");
        JTextField healthField = new JTextField();

        JLabel fertilizerLabel = new JLabel("Fertilizer:");
        JTextField fertilizerField = new JTextField();

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> {
            String name = nameField.getText();
            String type = typeField.getText();
            int frequency;
            try {
                frequency = Integer.parseInt(frequencyField.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(dialog, "Please enter a valid number for water frequency.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String health = healthField.getText();
            String fertilizer = fertilizerField.getText();

            Plant plant = new Plant(name, type, frequency, health, fertilizer);
            plantList.add(plant);
            tableModel.addRow(new Object[]{name, type, frequency, health, fertilizer});
            dialog.dispose();
        });

        dialog.add(nameLabel);
        dialog.add(nameField);
        dialog.add(typeLabel);
        dialog.add(typeField);
        dialog.add(frequencyLabel);
        dialog.add(frequencyField);
        dialog.add(healthLabel);
        dialog.add(healthField);
        dialog.add(fertilizerLabel);
        dialog.add(fertilizerField);
        dialog.add(new JLabel());
        dialog.add(saveButton);

        dialog.setVisible(true);
    }

    private void searchPlantDialog() {
        // Search dialog for finding a plant
        String searchName = JOptionPane.showInputDialog(frame, "Enter plant name to search:", "Search Plant", JOptionPane.QUESTION_MESSAGE);
        if (searchName != null && !searchName.trim().isEmpty()) {
            for (Plant plant : plantList) {
                if (plant.getName().equalsIgnoreCase(searchName.trim())) {
                    String details = "Name: " + plant.getName() + "\nType: " + plant.getType() + "\nWater Frequency: " + plant.getWaterFrequency() + " days\nHealth: " + plant.getHealth() + "\nFertilizer: " + plant.getFertilizer();
                    JOptionPane.showMessageDialog(frame, details, "Plant Details", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Plant not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void showPlantSummary() {
        // Initialize counters for healthy and unhealthy plants
        int totalPlants = plantList.size();
        int healthyPlants = 0;
        int unhealthyPlants = 0;

        // Loop through the plant list and count based on health
        for (Plant plant : plantList) {
            try {
                int healthValue = Integer.parseInt(plant.getHealth());
                if (healthValue >= 50 && healthValue <= 100) {
                    healthyPlants++;
                } else if (healthValue < 50) {
                    unhealthyPlants++;
                }
            } catch (NumberFormatException e) {
                // Ignore plants with non-numeric health values
            }
        }

        // Display the summary
        String summary = "Total Plants: " + totalPlants
                + "\nHealthy Plants: " + healthyPlants
                + "\nUnhealthy Plants: " + unhealthyPlants;
        JOptionPane.showMessageDialog(frame, summary, "Plant Summary", JOptionPane.INFORMATION_MESSAGE);
    }

    private void deletePlantDialog() {
        // Dialog to delete a plant
        String plantToDelete = JOptionPane.showInputDialog(frame, "Enter the name of the plant to delete:", "Delete Plant", JOptionPane.QUESTION_MESSAGE);
        if (plantToDelete != null && !plantToDelete.trim().isEmpty()) {
            boolean plantFound = false;
            for (Plant plant : plantList) {
                if (plant.getName().equalsIgnoreCase(plantToDelete.trim())) {
                    plantList.remove(plant);
                    // Update the table
                    updatePlantTable();
                    JOptionPane.showMessageDialog(frame, "Plant deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    plantFound = true;
                    break;
                }
            }
            if (!plantFound) {
                JOptionPane.showMessageDialog(frame, "Plant not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void updatePlantTable() {
        // Clear the table and reload the data
        tableModel.setRowCount(0);
        for (Plant plant : plantList) {
            tableModel.addRow(new Object[]{plant.getName(), plant.getType(), plant.getWaterFrequency(), plant.getHealth(), plant.getFertilizer()});
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PlantCareSystem::new);
    }
}

// Plant class to hold plant details
class Plant {
    private String name;
    private String type;
    private int waterFrequency;
    private String health;
    private String fertilizer;

    public Plant(String name, String type, int waterFrequency, String health, String fertilizer) {
        this.name = name;
        this.type = type;
        this.waterFrequency = waterFrequency;
        this.health = health;
        this.fertilizer = fertilizer;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getWaterFrequency() {
        return waterFrequency;
    }

    public String getHealth() {
        return health;
    }

    public String getFertilizer() {
        return fertilizer;
    }
}
