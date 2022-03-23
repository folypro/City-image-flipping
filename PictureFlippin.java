package com.example.sp22breakproject;


/**
 * This program is going to flip and allow user to guess what image is coming up after flipping the image!
 * This code is written by Abdulbasit Adeniji on 3/22/2022 by 12:18 AM.
 */

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;

public class PictureFlippin extends Application
{
    private ImageView Picture;
    private Image romeImage, parisImage,nycImage, londonImage,dubaiImage;
    private Button btn;

    @Override
    public void start(Stage primaryStage)
    {

        //Set the images height and width
        Picture = new ImageView();
        Picture.setFitHeight(350);
        Picture.setFitWidth(350);

        //load the images up from the file.
        romeImage = new Image("C:\\Users\\folag\\IdeaProjects\\SP-22-BREAK-PROJECT\\src\\main\\java\\com\\example\\sp22breakproject\\Image\\rome.jpg");
        parisImage = new Image("C:\\Users\\folag\\IdeaProjects\\SP-22-BREAK-PROJECT\\src\\main\\java\\com\\example\\sp22breakproject\\Image\\paris.jpg");
        nycImage = new Image("C:\\Users\\folag\\IdeaProjects\\SP-22-BREAK-PROJECT\\src\\main\\java\\com\\example\\sp22breakproject\\Image\\nyc.jpg");
        londonImage = new Image("C:\\Users\\folag\\IdeaProjects\\SP-22-BREAK-PROJECT\\src\\main\\java\\com\\example\\sp22breakproject\\Image\\london.jpg");
        dubaiImage = new Image("C:\\Users\\folag\\IdeaProjects\\SP-22-BREAK-PROJECT\\src\\main\\java\\com\\example\\sp22breakproject\\Image\\dubai.jpg");

        //Initializing the button and event lister using lambda expression
        btn =  new Button("FLIP");
        btn.setOnAction(e->{
            //Use math random to generate the toss landing point for the images
            int num = (int) (Math.random()*4);

            //Set the if and else statement for the display after the user hit the flip button

            if (num == 0){
                Picture.setImage(romeImage);
            }
            else if( num == 1){
                Picture.setImage(parisImage);
            }
            else if(num == 2){
                Picture.setImage(nycImage);
            }
            else if(num == 3){
                Picture.setImage(londonImage);
            }
            else{
                Picture.setImage(dubaiImage);
            }
        });

        //Set the Vbox
        VBox root = new VBox(Picture,btn);
        root.setAlignment(Pos.CENTER);

        //Create and display the scene!
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        //Set teh stage title
        primaryStage.setTitle("FLIPPING CITY IMAGE");

        //Show window
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
