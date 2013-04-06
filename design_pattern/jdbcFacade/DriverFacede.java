package jdbcFacade;

public class DriverFacede {
public static void main(String[] args) {
	JDBCFacade jfacade=new JDBCFacade();
	jfacade.jdbcOpen();
	//jfacade.jdbcSelect();
	//jfacade.jdbcInsert();
	//jfacade.jdbcPreparedInsert();//‘§±‡“Î÷∏¡Ó
	//String sql="UPDATE student SET name=\'ª∆\' WHERE id =\'200826740126\'";
	//jfacade.jdbcUpdate(sql);
	//jfacade.jdbcDelete();
	//jfacade.jdbcPrepareDelete();
	jfacade.jdbcClose();
}
}
