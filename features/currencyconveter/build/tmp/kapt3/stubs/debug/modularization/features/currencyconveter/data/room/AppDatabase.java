package modularization.features.currencyconveter.data.room;

import java.lang.System;

@androidx.room.Database(entities = {modularization.features.currencyconveter.data.models.Currency.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lmodularization/features/currencyconveter/data/room/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getRateDao", "Lmodularization/features/currencyconveter/data/room/RateDao;", "Companion", "currencyconveter_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    public static final int VERSION = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAME = "app-db";
    @org.jetbrains.annotations.NotNull()
    public static final modularization.features.currencyconveter.data.room.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract modularization.features.currencyconveter.data.room.RateDao getRateDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lmodularization/features/currencyconveter/data/room/AppDatabase$Companion;", "", "()V", "NAME", "", "VERSION", "", "currencyconveter_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}