# Document issue with DGS

## Issue
After upgrading DGS Framework to version 8.5.5 (issue was present in versions before as well), the following error occurs when starting the application:
```
GraphQL schema inspection:
	Unmapped fields: {Query=[currentUserProfile]}
	Unmapped registrations: {}
	Skipped types: []
```

## Solution / Workaround
The issue is caused by the parameter `dgs.graphql.schema-locations` in the `application.properties` file and the folder `graphql`. 
The parameter is not necessary when the folder `graphql` is renamed to `schema` (default location of DGS framework) and can be removed.