package ca.georgiancollege.comp1008fall2024thursdaysgui;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LoginModel {

    /*
            Create a Constructor
                determine if a directory with the name of "data" exists in our resources folder
                    if NOT, we will create it
                        Path.of(path/to/resources/directory)
                        Files.Exists or pathObject.toFile().exists()

                        Files.CreateDirectory(path object)


            Create method registerUser(String username, String password)

                create a file named username.txt where username is the text content of username
                    example: admin.txt, ben.txt
                the file content of this text file is the password of the user

                Bonus: determine if the filename already exists
                        if so, throw an exception

     */

    Path path;

    public LoginModel(){

        try{
            path = Path.of("src", "main", "resources",
                    "ca", "georgiancollege", "comp1008fall2024thursdaysgui",
                    "data");

            if(!Files.exists(path)){
                Files.createDirectory(path);
            }
        }
        catch(Exception e){
            throw new IllegalArgumentException("Error creating directory");
        }
    }

    /**
     * This method handles the logic of the user registration
     * @param username username of user
     * @param password password of user
     * @throws IllegalArgumentException if user already exists
     * @throws IOException if we don't have the required permissions
     */
    public void registerUser(String username, String password)
            throws IllegalArgumentException, IOException {

            String filename = username + ".txt";

            if(Files.exists(path.resolve(filename)))
                throw new IllegalArgumentException("User " + username + " already exists");

            Files.writeString(path.resolve(filename), password);

    }




}
