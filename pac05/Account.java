package pac05;

public class Account {
    private String name;
    private String pass;

    //コンストラクタ
    public Account(String name,String pass){
        this.name = name;
        this.pass = pass;
    }

    //SETTER
    public void setName(String name) {
        if(name.isEmpty()){      //如果輸入的名字是空白
            System.out.println("name is blank.");
            return;
        }
        this.name = name ;
    }
    public void setPass(String pass) {
        if(name.isEmpty()){      //如果輸入的名字是空白
            System.out.println("name is blank.");
            return;
        }
        this.pass = pass;
    }

    //GETTER
    public String getName(){

        return name;
    }
    public String getPass(){

        return pass;
    }

    public boolean certify(String name, String pass){
        if(this.name.equals(name) && this.pass.equals(pass)){
            System.out.println("認証成功\n");
            return true;
        }else{
            System.out.println("認証失敗\n");
            return false;
        }
    }



}
