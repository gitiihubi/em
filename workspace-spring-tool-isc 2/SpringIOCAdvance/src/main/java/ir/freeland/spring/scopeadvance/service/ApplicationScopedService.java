package ir.freeland.spring.scopeadvance.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
@Service
public class ApplicationScopedService implements BaseService {

}
