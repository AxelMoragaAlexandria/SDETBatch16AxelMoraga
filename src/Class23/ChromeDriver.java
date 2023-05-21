package Class23;

public class ChromeDriver implements WebDriver {


        @Override
        public void openBrowser(){
            System.out.println("Browser is opening");
        }
        @Override
        public void closeBrowser(){
            System.out.println("Browser is closing");
        }
        @Override
        public void maximizeWindow(){
            System.out.println("Windo2 is maximized");
        }
        @Override
        public void findElements(){
            System.out.println("Finding elements in website");
        }


}

class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("Browser is opening");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Browser is closing");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("Window is maximized");
    }
    @Override
    public void findElements(){
        System.out.println("Finding elements in website");
    }

}

