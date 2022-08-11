public class Main {

    public static void main(String[] args) {
       SerieProxy s = new SerieProxy(new GradeDeSerie());

        try {
            s.getSerie("Game Of Thrones");
            s.getSerie("Friends");
            s.getSerie("How i meet your Mother");
            s.getSerie("The Boys");
            s.getSerie("Grey´s Anatomy");
            s.getSerie("The Office");
        } catch (SerieNaoHabilitadaException myException) {
            System.out.println(myException.getMessage());
        }
    }
}