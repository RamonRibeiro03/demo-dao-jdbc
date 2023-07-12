package db;

public class DbIntegrityException extends RuntimeException{

    //Exceção personalizada de integrigade referencial

    public DbIntegrityException (String msg){
        super(msg);
    }
}
