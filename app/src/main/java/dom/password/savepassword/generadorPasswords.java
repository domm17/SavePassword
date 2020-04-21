package dom.password.savepassword;

public class generadorPasswords {

        public String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        public String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
        public String NUMEROS = "0123456789";

        public String getPinNumber(int length){
            return getPassword(NUMEROS, length);
        }

        public String getPassword(){
            return getPassword(8);
        }

        public String getPassword(int length){
            return getPassword(NUMEROS + MAYUSCULAS + MINUSCULAS, length);
        }

        public String getPassword(String key, int length) {
            String pws = "";
            for (int i = 0; i < length; i++) {
                pws+=(key.charAt((int)(Math.random() * key.length())));
            }
            return pws;
        }
}


