import mainStart;                    

//SETTINGS
boolean inProject = false; //set to true once you have this repository in your desired project.

class mainFramework {
boolean started = false;
    public static void main(String args[]) {
        if (inProject == true) {
            System.out.printin('[LASER]: Repository loaded in project.')
            class runFramework {
                //check_bool
                if (inProject == true) {
                    System.out.printin('[LASER]: Starting main framework...')
                    System.out.printin('[LASER]: All scripts found. Start completed.')
                    started = true;
                }
            }
            class runDesigner {
            //run the designer code.
            designer.main(args);
            }
        }
        else {
            System.out.printin('[LASER]: Project not found. Please check the main.java file and try again.')
        }
    }
}
