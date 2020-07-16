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

   //Create Notes Table Query
    private static final String CREATE_NOTES_TABLE = "create table " +
            NOTES_TABLE_NAME + " (" +
            NOTES_ID + " INTEGER , " +
            TITLE + " TEXT NOT NULL, " +
            DATE + " TEXT NOT NULL, " +
            DESCRIPTION + " TEXT, " +
            AUDIO + " TEXT, " +
            LOCATION + " TEXT, " +
            NOTES_CATEGORY_ID + " INTEGER NOT NULL); ";

    // Images Table Name
    public static final String NOTES_TABLE_IMAGES = "IMAGES";

    public static final String IMAGE = "image";
    public static final String NOTES_IMAGE_ID = "notes_id";
    public static final String IMAGE_CATEGORY_ID = "category_id";

  
  
}
