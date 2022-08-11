public class GradeDeFilmes implements IGradeDeFilmes {

    @Override
    public Filme getFilme(String nomeFilme){
        Filme f = null;

        switch (nomeFilme) {
            case "The White Tiger":
                f = new Filme("The White Tiger", "Argentina", "www.wtiger.com");
                break;
            case "His House":
                f = new Filme("His House", "Brasil", "www.hhouse.com");
                break;
            case "Over the moon":
                f = new Filme("Over the moon", "Colombia", "www.omoon.com");
                break;
            case "SuperDaddy":
                f = new Filme("SuperDaddy", "Argentina", "www.superD.com");
                break;
            case "A Saga das Batatas":
                f = new Filme("A Saga das Batatas", "Brasil", "www.potatosSaga.com");
                break;
            default:
        }
       return null;
    }
}
