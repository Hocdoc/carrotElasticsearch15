# Carrot2 3.10.1 with Elasticsearch 1.5.2

Testproject toshow my troubles with the two dependencies.

When running with `sbt run` I get this error message:

    [error] (run-main-0) java.lang.NoSuchFieldError: LUCENE_3_6
    java.lang.NoSuchFieldError: LUCENE_3_6
	         at org.elasticsearch.Version.<clinit>(Version.java:43)
	         at org.elasticsearch.client.transport.TransportClient.<init>(TransportClient.java:168)
	         at org.elasticsearch.client.transport.TransportClient.<init>(TransportClient.java:115)
	         at Hi$.main(helloWorld.scala:10)
	         at Hi.main(helloWorld.scala)
	         at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	         at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	         at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	         at java.lang.reflect.Method.invoke(Method.java:483)

