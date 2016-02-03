package be.nabu.eai.module.proxy;

import be.nabu.eai.repository.api.Repository;
import be.nabu.eai.repository.artifacts.jaxb.JAXBArtifact;
import be.nabu.libs.resources.api.ResourceContainer;

public class ProxyArtifact extends JAXBArtifact<ProxyConfiguration> {

	public ProxyArtifact(String id, ResourceContainer<?> directory, Repository repository) {
		super(id, directory, repository, "proxy.xml", ProxyConfiguration.class);
	}

}
