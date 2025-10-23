public class mainsuperHero {
    public static void main(String[] args) {
        //membuat 3 objek dari masing-masing konstruktor
        SuperHero hero1 = new SuperHero("captain amerika", "perisai");
        SuperHero hero2 = new SuperHero( "superman", "sinar laser");
        SuperHero hero3 = new SuperHero("batman", "batarang");
        SuperHero hero4 = new SuperHero("iron man", "armor suit");
        SuperHero hero5 = new SuperHero("thor", "mjolnir");

        // menampilkan identitas semua superhero 
        hero1.tampilkaidentitas();
        hero2.tampilkaidentitas();
        hero3.tampilkaidentitas();
        hero4.tampilkaidentitas();
        hero5.tampilkaidentitas();
    
    }
    
}
