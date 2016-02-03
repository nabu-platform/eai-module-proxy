package be.nabu.eai.module.proxy;

import java.io.IOException;
import java.util.List;

import be.nabu.eai.developer.MainController;
import be.nabu.eai.developer.managers.base.BaseJAXBGUIManager;
import be.nabu.eai.repository.resources.RepositoryEntry;
import be.nabu.libs.property.api.Property;
import be.nabu.libs.property.api.Value;

public class ProxyGUIManager extends BaseJAXBGUIManager<ProxyConfiguration, ProxyArtifact> {

	public ProxyGUIManager() {
		super("Proxy", ProxyArtifact.class, new ProxyManager(), ProxyConfiguration.class);
	}

	@Override
	protected List<Property<?>> getCreateProperties() {
		return null;
	}

	@Override
	protected ProxyArtifact newInstance(MainController controller, RepositoryEntry entry, Value<?>... values) throws IOException {
		return new ProxyArtifact(entry.getName(), entry, entry.getRepository());
	}

	@Override
	public String getCategory() {
		return "Protocols";
	}
	
	

}
