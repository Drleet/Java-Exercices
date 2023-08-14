
package ex1;


public class etudiant {
    private int code ;
    private String nom ;
    private String prenom ;

    public void setCode(int c) {
        code = c;
    }

    public int getCode() {
        return code;
    }
    
    public void setNom(String n) {
        nom = n;
    }

    public String getNom() {
        return nom;
    }

   
    public void setPrenom(String pre) {
        prenom = pre;
    }
    public String getPrenom() {
        return prenom;
    }
    
    public etudiant(int c, String n, String pren) {
        code = c;
        nom = n;
        prenom = pren;
    }

    @Override
    public String toString() {
        return "etudiant{" + "code=" + code + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    
    
}
