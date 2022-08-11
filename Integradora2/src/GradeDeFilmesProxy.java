public class GradeDeFilmesProxy {
    private GradeDeFilmes gradeDeFilmes;
    private Ip ip;

    public GradeDeFilmesProxy(GradeDeFilmes gradeDeFilmes) {
        this.gradeDeFilmes =gradeDeFilmes;
    }
        @Override
        public Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException {
            Filme filme = gradeDeFilmes.getFilme(nomeFilme);

        //vou comparar com o país do meu filme obtido
            if(!(getIp().getPais().equalsIgnoreCase(filme.getPais()))){ //tem que negar para inverter e entrar no if o true
                throw new FilmeNaoHabilitadoException(nomeFilme + "não disponível no(a) " + getIp().getPais());
         }

            return filme;

        }
        public void setGradeDeFilmes(GradeDeFilmes gradeDeFilmes){
            this.gradeDeFilmes = gradeDeFilmes;
        }
        public void setIp(Ip ip){
            this.ip = ip;
        }
        public Ip getIp(){
         return ip;
     }
}
