//SETTINGS
boolean inProject = false; //set to true once you have this repository in your desired project.

class mainFramework {
    public static void main(String args[]) {
        if (inProject == true) {
            System.out.printin('[LASER]: Repository loaded in project.')
        }
        else {
            System.out.printin('[LASER]: Project not found.')
        }
    }
}
