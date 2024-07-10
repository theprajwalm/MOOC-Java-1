public class Container {
    private int Container;

    public Container(){
        this.Container = 0;
    }

    public int contains(){
        return this.Container;
    }

    public void add(int amount){
        if (amount > 0) {
            if (this.Container + amount > 100) {
                this.Container = 100;
            }else{
                this.Container += amount;
            }
        }
    }

    public void remove(int amount){
        if (amount > 0) {
            if (this.Container - amount < 0) {
                this.Container = 0;
            }else{
                this.Container -= amount;
            }
        }
    }

    public void setContainer(int setValue){
        this.Container = setValue;
    }

    public String toString(){
        return this.Container + "/100";
    }
}
