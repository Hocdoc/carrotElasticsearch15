import org.elasticsearch.client.Client
import org.elasticsearch.client.transport.TransportClient
import org.elasticsearch.common.settings.ImmutableSettings
import org.elasticsearch.common.settings.Settings
import org.elasticsearch.common.transport.InetSocketTransportAddress

object Hi { 
  def main(args: Array[String]) = {
    val host = new InetSocketTransportAddress("localhost", 9200)
    val client = new TransportClient().addTransportAddresses(host)
    println("Hi!") 
  }
}
