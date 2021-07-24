package com.example.jersey.demo;

import com.google.common.collect.Sets;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import org.glassfish.jersey.server.validation.ValidationConfig;
import org.glassfish.jersey.server.validation.internal.InjectingConstraintValidatorFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.ContextResolver;
import java.util.Set;

/**
 * @author Chris
 */
@Component
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(RequestContextFilter.class);
        // registerClasses(findRegisterV1Resources());
        register(ApiV1.class);
        // register(UserResource.class);
        register(ValidationConfigurationContextResolver.class);
        register(ObjectMapperContextResolver.class);
    }

    /**
     * 批量注册 resources
     */
    private Set<Class<?>> findRegisterV1Resources() {
        Set<Class<?>> registerResources = Sets.newHashSet();
        registerResources.add(ApiV1.class);
        return registerResources;
    }

    public static class ValidationConfigurationContextResolver implements ContextResolver<ValidationConfig> {
        @Context
        private ResourceContext resourceContext;

        @Override
        public ValidationConfig getContext(final Class<?> type) {
            return new ValidationConfig().constraintValidatorFactory(resourceContext.getResource(InjectingConstraintValidatorFactory.class));
        }
    }
}
