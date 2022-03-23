# springcache
This spring boot demo project is part of a study to test and compare different caching mechanisms.
I am  simulating the delay in the real method call by using Thread.sleep()
In a basic HTTP GET REST API

The service layer method is annotated with @Cacheable("student"), to enable caching in this specific method only,Cache name is student.
In the getStudentByID() method there is an intentional 5 seconds delay using Thread.sleep(1000*5).
 - This is a dirty artifact to understand whether response is coming from cache or real backend. -

Let's see it in action! 
-Build the project, mvn clean install 
- run the application from either command line:   java SpringCacheApplication 
or just 
-run the SpringCacheApplication from your IDE

Both will start the application in localhost 8080 port

Go to url : http://localhost:8080/student/1
 you will get one JSON response of a Student object. 
 The first time, the response will take at least 5 seconds to response, then subsequent responses of the same url will be faster.
 It's possible to modify the delay time in the service class
 
 Go to url : http://localhost:8080/student/2
 -check the log - 
 
 
 
THE THEORY:
Caching is a mechanism to enhance the performance of a system. 
It is a temporary memory that lies between the application and the persistent database.
Cache memory stores recently used data items in order to reduce the number of database hits as much as possible.
- In-memory caching
- Database caching
- Web server caching
- CDN caching


to register a cache engine, spring boot provides integration with : 

-EhCache 2.x
-Hazelcast
-Infinispan
-Couchbase
-Redis
-Caffeine

Spring boot does the auto configuration with default options if those are present in class path and we have enabled cache by @EnableCaching in the spring boot application.




further changes:
- pagination
- sync
