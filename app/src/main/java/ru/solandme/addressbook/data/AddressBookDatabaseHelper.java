package ru.solandme.addressbook.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import ru.solandme.addressbook.data.DatabaseDescription.Contact;

public class AddressBookDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "AddressBook.db";
    private static final int DATABASE_VERSION = 1;

    public AddressBookDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        final String CREATE_CONTACTS_TABLE = "CREATE TABLE " +
                Contact.TABLE_NAME + "(" +
                Contact._ID + " integer primary key, " +
                Contact.COLUMN_NAME + " TEXT, " +
                Contact.COLUMN_PHONE + " TEXT, " +
                Contact.COLUMN_EMAIL + " TEXT, " +
                Contact.COLUMN_STREET + " TEXT, " +
                Contact.COLUMN_CITY + " TEXT, " +
                Contact.COLUMN_STATE + " TEXT, " +
                Contact.COLUMN_ZIP + " TEXT);";
        db.execSQL(CREATE_CONTACTS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
