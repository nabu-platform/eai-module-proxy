package be.nabu.eai.module.proxy;

import be.nabu.eai.repository.api.Repository;
import be.nabu.eai.repository.managers.base.JAXBArtifactManager;
import be.nabu.libs.resources.api.ResourceContainer;

public class ProxyManager extends JAXBArtifactManager<ProxyConfiguration, ProxyArtifact> {

	public ProxyManager() {
		super(ProxyArtifact.class);
	}

	@Override
	protected ProxyArtifact newInstance(String id, ResourceContainer<?> container, Repository repository) {
		return new ProxyArtifact(id, container, repository);
	}

}
