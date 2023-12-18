public class Main {

    public static void main(String[] args) {

        Personne personne = new Personne("houdni", "Badr", 18);

        System.out.println(personne);

        Employe employe = new Employe("HOUDNI", "BADR", 19, "Directeur", 50000);

        System.out.println(employe);

        if (personne.equals(employe)) {
            System.out.println("Les deux personnes sont egales");
        } else {
            System.out.println("Les deux personnes ne sont pas egales");
        }

        Personne personneClone = (Personne) personne.clone();

        System.out.println(personneClone);

        if (personne.equals(personneClone)) {
            System.out.println("La personne et son clone sont égales");
        } else {
            System.out.println("La personne et son clone ne sont pas égales");
        }
    }
}

