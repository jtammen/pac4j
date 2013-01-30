/*
  Copyright 2012 - 2013 Jerome Leleu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.pac4j.http.profile;

import org.pac4j.core.exception.TechnicalException;
import org.pac4j.core.profile.CommonProfile;

/**
 * This class is a profile creator which creates a HTTP profile with username set.
 * 
 * @author Jerome Leleu
 * @since 1.4.0
 */
public class UsernameProfileCreator implements ProfileCreator {
    
    /**
     * Create a HTTP profile.
     * 
     * @param username
     * @return the created profile
     * @throws TechnicalException
     */
    public HttpProfile create(final String username) throws TechnicalException {
        final HttpProfile profile = new HttpProfile();
        profile.addAttribute(CommonProfile.USERNAME, username);
        return profile;
    }
}
