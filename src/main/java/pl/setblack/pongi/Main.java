package pl.setblack.pongi;

import pl.setblack.pongi.users.UsersModule;

import java.time.Clock;


public class Main {


    public static void main(final String... args) throws Exception {
        final Clock clock = Clock.systemUTC();

        final UsersModule usersModule = new UsersModule(clock);

        Server server = new Server(
                usersModule.createService());
        server.start();

    }

}
