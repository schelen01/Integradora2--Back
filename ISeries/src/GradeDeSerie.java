import java.util.Locale;

public class GradeDeSerie implements IGradeDeSeries {
    @Override
    public String getSerie(String nomeBusca) throws SerieNaoHabilitadaException{
        ISerie s = null;

        String link = "www." + nomeBusca.replace(" ", "").toLowerCase() + ".com";
        
        s= switch (nomeBusca){
            case "Game Of Thrones" -> new ISerie("Game Of Thrones", link);
            case "Friends" -> new ISerie("Friends", link);
            case "How i meet your Mother" -> new ISerie("How i meet your Mother", link);
            case "The Boys" -> new ISerie("The Boys", link);
            case "Grey´s Anatomy" -> new ISerie("Grey´s Anatomy", link);
            case "The Office" -> new ISerie("The Office", link);
            default -> throw new SerieNaoHabilitadaException("Serie: " + nomeBusca + " não encontrada.");

        };
        return link;
    }

}
