package network;

@FunctionalInterface
interface Connectivity {
    int print();

}

abstract class BaseConnectivity implements Connectivity  {
    void ChangeConnection(BaseConnectivity connectivity){}
    void AddConnection(BaseConnectivity connectivity){}
    void RemoveConnection(BaseConnectivity connectivity){}
    abstract BaseConnectivity FindConnection();
}

abstract class DirectExposure extends BaseConnectivity {}
abstract class Tunneling extends BaseConnectivity{}
abstract class VirtualPrivateNetwork extends BaseConnectivity{}
abstract class Proxy extends BaseConnectivity{}
class Samp extends BaseConnectivity{

    @Override
    BaseConnectivity FindConnection() {
        return null;
    }

    public void sa(){
        System.out.println("asd");
    };

    @Override
    public int print() {
        return 0;
    }
}
final class ZeroTrustNetworkAccess extends BaseConnectivity{

    Samp s = new Samp(){
        int a = 0;
        {
            a = 4;
            System.out.println(" ");
        }
    };

    Samp mp = new Samp();


    Connectivity conn = () -> {
        return 3;
    };
    @Override
    BaseConnectivity FindConnection() {
        return null;
    }

    @Override
    public int print() {

        return 0;
    }
}



abstract class CloudNativeIngress extends BaseConnectivity{}
abstract class DedicatedEnterpriseLink extends BaseConnectivity{}


abstract class PublicIPHosting extends DirectExposure{}
abstract class PortForwarding extends DirectExposure{}

abstract class ReverseTunnel extends Tunneling{}
abstract class SSHTunnel extends Tunneling{}
abstract class GenericRoutingEncapsulation extends Tunneling{}
abstract class IPinIPTunnel extends Tunneling{}

abstract class SiteToSiteVPN extends VirtualPrivateNetwork{}
abstract class ClientToSiteVPN extends VirtualPrivateNetwork{}
abstract class OverlayVPN extends VirtualPrivateNetwork{}

abstract class ReverseProxy extends Proxy{}
abstract class ForwardProxy extends Proxy{}

abstract class LoadBalancer extends CloudNativeIngress{}
abstract class APIGateway extends CloudNativeIngress{}
abstract class CDNEdgeRouting extends CloudNativeIngress{}


abstract class MPLS extends DedicatedEnterpriseLink{}
abstract class LeasedLine extends DedicatedEnterpriseLink{}
abstract class SDWAN extends DedicatedEnterpriseLink{}


public class Connection {

}


