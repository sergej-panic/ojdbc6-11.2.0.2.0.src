package oracle.jdbc.internal;

import java.sql.SQLException;
import oracle.jdbc.driver.InternalFactory;

public abstract class KeywordValueLong
{
  public abstract int getKeyword()
    throws SQLException;

  public abstract byte[] getBinaryValue()
    throws SQLException;

  public abstract String getTextValue()
    throws SQLException;

  public static final KeywordValueLong constructKeywordValue(int paramInt, String paramString)
    throws SQLException
  {
    return InternalFactory.createKeywordValueLong(paramInt, paramString, null);
  }

  public static final KeywordValueLong constructKeywordValue(int paramInt, byte[] paramArrayOfByte)
    throws SQLException
  {
    return InternalFactory.createKeywordValueLong(paramInt, null, paramArrayOfByte);
  }
}