package entity;

import java.util.Scanner;

public abstract class categoties implements IApp {
    private static int catalogIdSequence = 0;
    private int categoryId;
    private String categoryName;
    private int priority;
    private String description;
    private boolean status;

    public categoties(){
        categoryId = catalogIdSequence++;
    }

    public categoties(int categoryId, String categoryName, int priority, String description, boolean status) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.priority = priority;
        this.description = description;
        this.status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {

    }

    @Override
    public void displayData() {

    }
}
