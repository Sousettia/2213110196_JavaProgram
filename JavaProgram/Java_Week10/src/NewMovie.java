public class NewMovie {
    private String id;
    private String name;
    private NewDirector director;
    public NewMovie(String id, String name, NewDirector director) {
        this.id = id;
        this.name = name;
        this.director = director;
    }
    public NewMovie() {
        this.id = "";
        this.name = "";
        this.director = null;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public NewDirector getDirector() {
        return director;    
    }
    public void setDirector(NewDirector director){
        this.director = director;
    }
    @Override
    public String toString(){
        return getId() + " " + getName() + " direct by " + director;
    }
}
