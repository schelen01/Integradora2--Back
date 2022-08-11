public class SerieProxy implements IGradeDeSeries {
    private int qtdViews;
    private SerieProxy serieProxy;

    public SerieProxy(GradeDeSerie gradeDeSerie){
        this.serieProxy = serieProxy;
        qtdViews = 0;
    }

    //implementar o método getSerie, e lança a exceção
    @Override
    public String getSerie(String nomeBusca) throws SerieNaoHabilitadaException {
        String s = this.serieProxy.getSerie(nomeBusca);
        if (qtdViews < 6) {
            qtdViews++;
            System.out.println("Buscando por: " + nomeBusca + ". Encontrado: " + s + ".");
        } else
            throw new SerieNaoHabilitadaException("Excede o número de reproduções permitidas");
        return s;
    }

}
