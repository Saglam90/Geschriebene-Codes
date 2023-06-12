package BeobachterModel;

public class MVC_Anwendung {
    public static void main(String[] args) {
        Zitate_Model zitate_Model = new Zitate_Model();
        Zitate_View zitate_View = new Zitate_View();

        Zitate_Controller controller = new Zitate_Controller(zitate_Model, zitate_View);
        controller.setNname("Arkasu");
        controller.setZitat("Wir werden Sie klein machen");
        controller.updateView();

        controller.setNname("Lynen");
        controller.setZitat("Schade um die 100 Punkte");
        controller.updateView();

        controller.setNname("Chaves");
        controller.setZitat("Kein Backup - kein Mitleid");
        controller.updateView();

        controller.setNname("Lynen");
        controller.setZitat("Das Leben ist ein Kampf - siege");
        controller.updateView();
    }
}
