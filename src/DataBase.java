public class DataBase {
        private String user = "" ;
        private String token = "";

    //constructores
        private DataBase(String user, String token){
            this.user = user;
            this.token = token;
        }

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
