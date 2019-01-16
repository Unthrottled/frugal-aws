# Outline

- Who is this for?
    - Developers who want to go to learn how to go to production on a budget.

- What do I hope to accomplish?
    - How to deploy production systems without OpenShift.
    - How to mimic a production like environment locally.
    - A basic working knowledge of what AWS is.
    - A understanding of how to provide trusted secure web traffic.
    - How to route requests to domains.
    - An understand of what costs you may be responsible for.
    
- How do we do the things?

# Structure

- Who is this for?
    - Developers who want to go to learn how to go to production on a budget.
    
- What is Production Like?
    - HTTPS
        - HTTP -> HTTPS redirection
        - Valid certificates
    - Graceful failures
        - 404 Errors
        - Maintenance windows
    - Sub-Domain support
    - Quick Response Times
        - Fail Fast

- How do I do all of that?
    - Organize all of your projects
        - Group them by application category
            - Static Content
                - Just a simple html based application that does not have a corresponding backed/REST API
            - Web Servers
                - Projects that run servers and normally are accessed from `localhost:8080` or something like that.
    - Install Docker on your local machine
        - Supported on: MacOS, Linux, and Windows 10 Pro        
    - Sign Up for an AWS Account
    - ???
    - Profit!
    - Learn how to setup things locally then draw the AWS parallel.
    
        