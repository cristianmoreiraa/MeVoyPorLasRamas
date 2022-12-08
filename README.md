ARCHIVO README.md

# SINGLETON

1.Creamos un objeto en la misma clase, ya que el 'Constructor es privado'

### Quedaría así:
     private DataBase(){

        }
    //instanciamos los Getter & Setters
        public void setUser(){
        }

        public String getUser(){
            return user;
        }

        public String getToken(){
            return token;
        }

        public static DataBase user1 = new DataBase("Manolo" , "123AA");
        private static DataBase user2 = null;

        public static DataBase getNewUser(){
            if (user2 == null){
                user2 = new DataBase();
            }return user2;
        }
    }


# En la clase MAIN llamamos así a los objetos:
    public class Main {
    public static void main(String[] args) {

        //instanciamos un objeto

        System.out.println(DataBase.user1.getUser());
        System.out.println(DataBase.user1.getToken());

        DataBase.getNewUser();
         }
    }
    

