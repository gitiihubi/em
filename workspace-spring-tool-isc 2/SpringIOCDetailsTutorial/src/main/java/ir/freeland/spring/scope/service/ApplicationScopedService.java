package ir.freeland.spring.scope.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
@Service
public class ApplicationScopedService implements BaseService {

}
