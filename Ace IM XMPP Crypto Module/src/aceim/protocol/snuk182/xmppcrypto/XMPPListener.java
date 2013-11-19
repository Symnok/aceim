package aceim.protocol.snuk182.xmppcrypto;

abstract class XMPPListener {
	
	private final XMPPServiceInternal mService;

	XMPPListener(XMPPServiceInternal service) {
		this.mService = service;
	}

	/**
	 * @return the mService
	 */
	public XMPPServiceInternal getInternalService() {
		return mService; 
	}

	abstract void onDisconnect();
}
