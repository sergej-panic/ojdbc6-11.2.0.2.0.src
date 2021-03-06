package oracle.jdbc.driver;

class RefTypeBinder extends TypeBinder
{
  Binder theRefTypeCopyingBinder = OraclePreparedStatementReadOnly.theStaticRefTypeCopyingBinder;

  private static final String _Copyright_2007_Oracle_All_Rights_Reserved_ = null;
  public static final String BUILD_DATE = "Sat_Aug_14_12:18:34_PDT_2010";
  public static final boolean TRACE = false;

  RefTypeBinder()
  {
    init(this);
  }

  static void init(Binder paramBinder)
  {
    paramBinder.type = 111;
    paramBinder.bytelen = 24;
  }

  Binder copyingBinder()
  {
    return this.theRefTypeCopyingBinder;
  }
}