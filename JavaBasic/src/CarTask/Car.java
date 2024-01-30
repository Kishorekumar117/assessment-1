package CarTask;

public class Car {
	   
    private class Engine {
        private String engineType;

        Engine(String type) {
            this.engineType = type;
        }

        
        String getEngineType() {
            return engineType;
        }
    }

    private Engine hondaEngine = new Engine("V6");
    private Engine toyotaEngine = new Engine("Inline-4");
    private Engine bmwEngine = new Engine("V8");

    public void displayCarList() { 
        System.out.println("List of Cars:");
        System.out.println("1. Honda");
        System.out.println("2. Toyota");
        System.out.println("3. BMW");
    }

    public void getCarEngine(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Selected Car: Honda");
                System.out.println("Engine Type: " + hondaEngine.getEngineType());
                break;
            case 2:
                System.out.println("Selected Car: Toyota");
                System.out.println("Engine Type: " + toyotaEngine.getEngineType());
                break;
            case 3:
                System.out.println("Selected Car: BMW");
                System.out.println("Engine Type: " + bmwEngine.getEngineType());
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }


}