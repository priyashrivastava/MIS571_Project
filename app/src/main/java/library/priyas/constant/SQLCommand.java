package library.priyas.constant;

/**
 * Created by Priya on 10/2/2016.
 */

public abstract class SQLCommand
{
    //query all students
    public static String QUERY_STUDENT = "select stid, stname from Student";

    //list all data in books table
    public static String QUERY_1 = "select lbcallnum, lbtitle from libbook";
    //List the call numbers of books with the title ‘Database Management’
    public static String QUERY_2 = "select lbcallnum from libbook where lbtitle like '%Database Management%'";
    public static String QUERY_3 = "select * from checkout";
    public static String QUERY_4 = "select libbook.lbcallnum, checkout.stid, checkout.cofine from libbook, checkout where cofine>2 group by checkout.stid ";
    public static String QUERY_5 = "select student.* from student, checkout where student.stid=checkout.stid";
    public static String QUERY_6 = "select * from libbook where lbtitle like '%Organizations%'";
    public static String QUERY_7 = "select stid, stname from student where stname like'%Jefferson%'";
    //public static String QUERY_8 = "select lbcallnum from libbook where lbtitle like '%Contract Law%'";

    public static String RETURN_BOOK = "update checkout set coreturned=? where stid=? and lbcallnum=?";
    public static String CHECK_BOOK = "insert into checkout(stid,lbcallnum,coduedate,coreturned) values(?,?,?,?)";

    public static String CHECKOUT_SUMMARY = "select strftime('%m',coduedate) as month,count(*) as total from checkout where strftime('%Y',coduedate)='2011' group by month order by total desc";

}


