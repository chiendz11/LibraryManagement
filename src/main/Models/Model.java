package main.Models;

import javafx.collections.FXCollections;
import main.Views.ViewFactory;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;
    private boolean clientLoginSuccessFlag;
    
    private Model() {
        this.viewFactory = new ViewFactory();
        
        // Client Data Section
    }

    public static synchronized Model getInstance() {
        if (model == null){
            model = new Model();
        }
        return model;
    }
    public ViewFactory getViewFactory() {
        return viewFactory;
    }
    public boolean getClientLoginSuccessFlag() {
        return clientLoginSuccessFlag;}
}

