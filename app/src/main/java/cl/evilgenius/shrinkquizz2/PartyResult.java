package cl.evilgenius.shrinkquizz2;

public class PartyResult extends PartyAnswer {

    public PartyResult(String answer) {
        super(answer);
    }

    public String score (){
        return processing();
    }

    private String processing(){
        String answer = getAnswer();
       /* switch (answer){
            case "1":
                return "ECONOMICO";
            case "5":
                return "Sigues siendo un niño";
            case "10":
                return "Bien Campeon";
            case "Toda la noche":
                return "WN, Necesitas AYUDA!!!!";


        }*/

     if (answer .contains("5")){
         return "Sigues siendo un niño";

        }else if (answer.contains("10")){
         return "Bien Campeon";

         }else{
         return "WN, Necesitas AYUDA!!!!";

        }
    }
}
