package com.NoteGVAandroid;

public class SQLLiteDatabaseHelper extends SQLiteOpenHelper {
    static final String DATABASE_NAME = "NOTES.DB";
    static final int DB_VERSION = 1;

    //CategoryModel Table Name
    public static final String CATEGORY_TABLE_NAME = "CATEGORIES";

    //CategoryModel Table Column
    public static final String CATEGORY_ID = "category_id";
    public static final String CATEGORY_NAME = "category_name";

    // Create CategoryModel Table Query
    private static final String CREATE_CATEGORY_TABLE = "create table " +
            CATEGORY_TABLE_NAME + "(" +
            CATEGORY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            CATEGORY_NAME + " TEXT NOT NULL );";

  
  
  
}
