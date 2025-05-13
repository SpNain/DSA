public static int countAlphabets(String password) {
    int alpha_count = 0;

    for(int idx = 0; idx < password.length(); idx++){
    int ch = password.charAt(idx);

    if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ){
        alpha_count++;
    }
    }   
    return alpha_count;
}
