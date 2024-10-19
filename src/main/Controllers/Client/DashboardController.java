package main.Controllers.Client;

import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;

public class DashboardController {

    @FXML
    private PieChart pieChart;

    @FXML
    private Button btnBorrowReturn;

    @FXML
    private Button btnBorrowingBooks;

    @FXML
    private Button btnBorrowedBooks;

    @FXML
    private Button btnOverdueBooks;

    @FXML
    public void initialize() {
        PieChart.Data availableBooks = new PieChart.Data("Available Books", 30);
        PieChart.Data borrowedBooks = new PieChart.Data("Borrowed Books", 5);
        PieChart.Data overdueBooks = new PieChart.Data("Overdue Books", 2);

        pieChart.getData().addAll(availableBooks, borrowedBooks, overdueBooks);

        for (PieChart.Data data : pieChart.getData()) {
            Tooltip tooltip = new Tooltip();
            tooltip.setText(data.getName() + ": " + (int) data.getPieValue());
            Tooltip.install(data.getNode(), tooltip);

            data.getNode().setOnMouseEntered(e -> {
                data.getNode().setStyle("-fx-font-size: 16; -fx-font-weight: bold;");
            });
        }

        btnBorrowReturn.setOnAction(e -> System.out.println("Manage Borrow/Return clicked"));

    }
}