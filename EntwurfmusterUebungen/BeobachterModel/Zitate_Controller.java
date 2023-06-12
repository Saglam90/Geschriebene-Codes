package BeobachterModel;

public class Zitate_Controller {
    private Zitate_Model model;
    private Zitate_View view;
    
    public Zitate_Controller(Zitate_Model model,Zitate_View view){
        this.model=model;
        this.view=view;
    }

    public String getnName() {
        return model.getNname();
    }

    public void setNname(String nname) {
        model.setNname(nname);
    }
  
     public String getView() {
        return model.getZitat();
    }

    public void setZitat(String zitat) {
        model.setZitat(zitat);
    }
    
    public void updateView(){
        view.ausgabe(model.getNname(), model.getZitat());
    }
}
