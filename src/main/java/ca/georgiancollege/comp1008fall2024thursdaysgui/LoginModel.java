package ca.georgiancollege.comp1008fall2024thursdaysgui;

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

    public LoginModel(){}
    public void registerUser(String username, String password){}




}
