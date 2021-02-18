<%-
/*
 * Copyright 2020 RA Consulting
 *
 * RA Consulting GmbH licenses this file under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except 
 * in compliance with the License. 
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
-%>
<%=JavaLicenseHelper.getApache2License()%>

#pragma once
#include "ApiClassImpl.h"
#include "IOpenScenarioWriterFactory.h"
#include "MemLeakDetection.h"

namespace NET_ASAM_OPENSCENARIO
{
    namespace v1_0
    {
<%= helper.makeClassJavaDoc(oscVersion, "        ")%>
        class OpenScenarioWriterFactoryImpl: public IOpenScenarioWriterFactory  
        {
        public:
<%- element.each{ umlClass ->-%>

            std::shared_ptr<I<%=umlClass.name.toClassName()%>Writer> Create<%=umlClass.name.toClassName()%>Writer() override
            {
                return std::make_shared<<%=umlClass.name.toClassName()%>Impl>();
            }
<%-}-%>
        };
    }
}